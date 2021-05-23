package com.test.pattern.factorydemo.sqlhelper.org.jdbc.sqlhelper;


import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * ??????????????
 * @author tanyongde
 */
public class ConManager {
	
	private static Pool dbPool;
	
	private static ConManager instance = null;// ????????
	

	/**
	 * ??й??????????????????????????????????????<code>getIstance</code>???? ???????????е??????
	 */
	private ConManager() {
	}
	/**
	 * ???????????????
	 */
	protected static void closeCon(Connection con) {
			dbPool.freeConnection(con);
	}

	/**
	 * ???????????????????????
	 */
	private static ConManager getInstance() {
		if (null == instance) {
			instance = new ConManager();
		}
		return instance;
	}

	/**
	 * ??????????????????л????????????
	 * @return
	 */
	protected static Connection getConnection()
	{
		Connection conn = null;
		try
		{
			if(dbPool == null)
			{
				dbPool = DBConnectionPool.getInstance();
			}
			conn = dbPool.getConnection();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 *  ??? JNDI ?? ?????????????????? ?????????????
	 * @param  ?????????????????????
	 * 		  Tomcat ??????????? "java:comp/env/...(???????)"
	 * @return
	 */
	protected static Connection getConnection(String lookupStr) {
		Connection conn = null;
		try {
			ConManager.getInstance();
			//??? JNDI ??Tomcat ?????????????????? ?????????????
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup(lookupStr);
			conn = ds.getConnection();
		} catch (Exception e1) {
//			BeanUtils.copyProperties(new Object(), new Object());
			e1.printStackTrace();
		}
		return conn;
	}

}