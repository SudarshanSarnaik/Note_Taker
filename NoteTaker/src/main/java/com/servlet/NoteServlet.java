package com.servlet;

import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Note;
import com.helper.TransictionProvider;

@WebServlet("/note")
public class NoteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        // Create a new Note object
        Note note = new Note();
        note.setTitleString(title);
        note.setContentString(content);
        note.setAddeDate(new Date());

        // Get a fresh EntityManager from TransictionProvider
        EntityManager em = TransictionProvider.getNewEntityManager();  // Correct method to get fresh EntityManager
        
        // Begin transaction
        em.getTransaction().begin();

        // Persist the note object
        em.persist(note);

        // Commit transaction
        em.getTransaction().commit();

        // Close the EntityManager
        em.close();  // Close after transaction

        // Optionally, close the EntityManagerFactory, but it's often done at application shutdown
        // TransictionProvider.closeTransaction(); // Not needed here if closing EntityManager is done

     // Send response
        response.setContentType("text/html");
        response.getWriter().println("<html>");
        response.getWriter().println("<head>");
        response.getWriter().println("<title>Note Added</title>");
        response.getWriter().println("<style>");
        response.getWriter().println("body { font-family: Arial, sans-serif; background-color: #f8f9fa; text-align: center; padding: 50px; }");
        response.getWriter().println("h1 { color: #6f42c1; }");
        response.getWriter().println("a { display: inline-block; margin-top: 20px; padding: 10px 20px; background-color: #6f42c1; color: white; text-decoration: none; border-radius: 5px; }");
        response.getWriter().println("a:hover { background-color: #563d7c; }");
        response.getWriter().println("</style>");
        response.getWriter().println("</head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Note Added Successfully!</h1>");
        response.getWriter().println("<a href='allNotes.jsp'>View All Notes</a>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
