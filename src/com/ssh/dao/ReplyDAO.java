package com.ssh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssh.model.Message;
import com.ssh.model.Reply;

@Component
public class ReplyDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession()
	{
		return this.sessionFactory.getCurrentSession();
	}
	
	
	//������dao����
	
	
	//1.�־û�һ������
	public void SaveReply(Reply reply)
	{
		this.getSession().save(reply);
		
	}
	
	//2.ɾ��һ������
	public void DeleteReply(Reply reply)
	{
		this.getSession().delete(reply);
	}
	

	//3.����һ��message����ѯ��message����������
	public List<Reply> FindReplyByMessage(Message message)
	{
		String hql="from Reply c where c.hmessage.id=?";
		return this.getSession().createQuery(hql).setLong(0, message.getId()).list();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
