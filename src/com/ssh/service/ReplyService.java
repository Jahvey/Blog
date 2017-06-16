package com.ssh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssh.dao.ReplyDAO;
import com.ssh.model.Message;
import com.ssh.model.Reply;
import com.sun.org.apache.regexp.internal.recompile;

@Component
public class ReplyService {

	@Autowired
	private ReplyDAO replyDAO;
	
	public ReplyDAO getReplyDAO() {
		return replyDAO;
	}
	public void setReplyDAO(ReplyDAO replyDAO) {
		this.replyDAO = replyDAO;
	}
	
	
	//1.�־û�һ��reply
	public void saveReply(Reply reply)
	{
		this.replyDAO.SaveReply(reply);
	}
	
	
	//2.ɾ��һ��reply
	public void deleteReply(Reply reply)
	{
		this.replyDAO.DeleteReply(reply);
	}
	
	//3.����һ��message��ѯ��message����������
	public List<Reply> findReplybymessage(Message message)
	{
		return this.replyDAO.FindReplyByMessage(message);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
