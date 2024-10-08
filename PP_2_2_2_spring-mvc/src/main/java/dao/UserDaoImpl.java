package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void removeUserById(long id) {
        try {
            if (getUserById(id) != null) {
                entityManager.remove(getUserById(id));
            }
        } catch (EntityNotFoundException e) {

        }

    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();

    }

    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(User updaeteUser) {
        try {
            if (getUserById(updaeteUser.getId()) != null) {
                entityManager.merge(updaeteUser);
            }
        } catch (EntityNotFoundException e) {
        }
    }
}