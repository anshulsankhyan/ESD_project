package com.example.demorest.DAO.DAOImplementation;


import com.example.demorest.Bean.Organization;
import com.example.demorest.DAO.OrganizationDAO;

import com.example.demorest.DAO.OrganizationDAO;
import com.example.demorest.Util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class OrganizationDAOImpl implements OrganizationDAO {
    @Override
    public boolean addOrganization(Organization deptObj) {
        try(Session session = HibernateSessionUtil.getSession()){  // session created got access of hibernate session object
            Transaction transaction = session.beginTransaction();  // transaction initiated
            session.save(deptObj);                                 // using session object to save java object into MySQL
            transaction.commit();                                  // committing transaction
            return true;
        }
        catch (HibernateException exception) {
            // if Hibernate Exception occurs return false
            // for related exception we can maintain separate logger / Sysout messages for easy debugging
            System.out.println("Hibernate Exception");
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
        catch (Exception e){
            //generalized exception class for any IO / Arithmetic Exception
            System.out.print(e.getLocalizedMessage());
            return false;
        }
    }

    @Override
    public List<Organization> getDepartmentList() {
        return null;
    }

    @Override
    public List<Organization> getOrganizationList() {
        try (Session session = HibernateSessionUtil.getSession()){
            List<Organization> OrganizationList = new ArrayList<>();
            for (final Object d : session.createQuery("from Organization ").list()) {
                OrganizationList.add((Organization) d);
            }
            return OrganizationList;

        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }
}