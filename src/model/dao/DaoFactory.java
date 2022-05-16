package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public final class DaoFactory
{
    //STATIC METHODS
    public static SellerDao createSellerDao()
    {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao()
    {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
