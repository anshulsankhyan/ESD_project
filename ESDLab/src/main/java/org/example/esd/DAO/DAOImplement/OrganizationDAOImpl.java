package org.example.esd.DAO.DAOImplement;

import org.example.esd.Bean.organizations;
import org.example.esd.DAO.OrganizationDAO;
import org.example.esd.Util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OrganizationDAOImpl implements OrganziationDAO {

    @Override
    public boolean addorganization(Department department) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(organization);
            transaction.commit();
            return true;
        } catch (HibernateException hibernateException) {
            System.out.println("Hibernate Exception");
            System.out.print(hibernateException.getLocalizedMessage());
            return false;
        }
    }
}