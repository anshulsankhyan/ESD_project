package com.example.demorest.DAO.DAOImplementation;


import com.example.demorest.Bean.Employee;
import com.example.demorest.DAO.EmployeeDAO;
import com.example.demorest.Util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public boolean addEmployee(Employee empObj) {
        try(Session session = HibernateSessionUtil.getSession()){
            Transaction t = session.beginTransaction();
            session.save(empObj);
            t.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.println(exception.getLocalizedMessage());
            return false;
        }
    }

    @Override
    public List<Employee> getEmployee(){
        try (Session session = HibernateSessionUtil.getSession()){
            List<Employee> empList = new ArrayList<>();
            for (final Object d : session.createQuery("from  Employee").list()) {
                empList.add((Employee) d);
            }
            return empList;

        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }

    @Override
    public List<Employee> getEmployeeSalaryInRange(long lowerBound, long upperBound) {
        return null;
    }

    @Override
    public Employee getEmployeeByID(int empID) {
        try (Session session = HibernateSessionUtil.getSession()) {
            return session.get(Employee.class, empID);
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
        }
        return null;
    }




    @Override
    public boolean deleteEmployee(int empID) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction t = session.beginTransaction();
            //first fetch object and then delete it
            Employee empObj= session.get(Employee.class, empID);
            session.delete(empObj);
            t.commit();
            System.out.println( "Employee Deleted having employee ID - "+ empID);
            return true;
        }
        catch (HibernateException exception){
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }

    @Override
    public Double avgSalary() {
        return null;
    }


}