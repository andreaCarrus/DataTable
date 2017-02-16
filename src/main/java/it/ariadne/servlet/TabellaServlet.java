package it.ariadne.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;


/**
 * Servlet implementation class TabellaServlet
 */
public class TabellaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Persona> listaPersone;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TabellaServlet() {
        super();
        listaPersone = new ArrayList<Persona>();
        initList();
    }

	private void initList() {
		
		String s;
		for(int i=0;i<200;i++){			
			s = String.valueOf(i);			
			listaPersone.add(new Persona("nome"+i, "position"+i, "office"+i, "extn"+i, "date"+i, "salary"+i*1000));			
		}
		
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Gson gson = new Gson();
		JsonObject jsonObject = new JsonObject();
		JsonArray globalArray = new JsonArray();
		
		for (Persona p : listaPersone) {
			JsonArray array = new JsonArray();
			array.add(new JsonPrimitive(p.getName()));
			array.add(new JsonPrimitive(p.getPosition()));
			array.add(new JsonPrimitive(p.getOffice()));
			array.add(new JsonPrimitive(p.getExtn()));		
			globalArray.add(array);
			
		}

		jsonObject.add("demo", globalArray);
//		System.out.println(gson.toJson(jsonObject));
		
		PrintWriter out = response.getWriter();

		out.println(gson.toJson(jsonObject));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
