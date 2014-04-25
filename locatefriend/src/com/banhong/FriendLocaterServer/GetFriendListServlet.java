package com.banhong.FriendLocaterServer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.*;
/**
 * Servlet implementation class GetFriendListServlet
 */
public class GetFriendListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetFriendListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		JSONArray array = new JSONArray();
		for(int i =0;i< 5;i++)
		{
		    JSONObject json=new JSONObject();
		    json.put("name", "user_"+i);
		    json.put("x", 116468940+i*5000);
		    json.put("y", 39890560);
		    array.add(json);
		    
		}
		response.setStatus(HttpServletResponse.SC_OK);
		PrintWriter output = response.getWriter();
		output.println(array.toString());
		output.flush();
		output.close();
		//response.sendRedirect("./GetFriend?friend="+json.toString());				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
