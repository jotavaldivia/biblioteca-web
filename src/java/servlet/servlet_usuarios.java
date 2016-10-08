package servlet;
import control.control_prestamos;
import control.control_usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.usuarios;

@WebServlet(name = "servlet_usuarios", urlPatterns = {"/servlet_usuarios"})
public class servlet_usuarios extends HttpServlet {
    control_usuarios usu=new control_usuarios();
    control_prestamos pres=new control_prestamos();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //capturar p desde el cliente
            int p=Integer.parseInt(request.getParameter("p"));
            //objeto para direccionamiento
            RequestDispatcher rd;
            switch(p){
                case 1:
                    usu.setPer_rut(request.getParameter("user"));
                    usu.setPer_contraseña(request.getParameter("pass"));
                    if(usu.verificar()){
                        //crear variables de session
                        request.getSession().setAttribute("nombre",
                                usu.getPer_nombre()+" "+
                                usu.getPer_apellido());
                        response.sendRedirect("index.jsp");
                    }else
                        response.sendRedirect("index.jsp?error=Usuario o Password Incorrecto");
                break;
                case 2:
                    //cerrar sesión
                    request.getSession().invalidate();
                    response.sendRedirect("index.jsp");
                break;
                case 3:
                    //crear cuenta
                    if(request.getParameter("v6").equals(request.getParameter("v7"))){
                    usu.setPer_rut(request.getParameter("v1"));
                    usu.setPer_nombre(request.getParameter("v2"));
                    usu.setPer_apellido(request.getParameter("v3"));
                    usu.setPer_direccion(request.getParameter("v4"));
                    usu.setPer_telefono(request.getParameter("v5"));
                    usu.setPer_contraseña(request.getParameter("v6"));
                    usu.setPer_correo(request.getParameter("v8"));
                    usu.setCur_cod(request.getParameter("v9"));
                    //grabar datos
                    usu.crear_cuenta();
                    rd=request.getRequestDispatcher("index.jsp");
                    rd.forward(request, response);
                    }else{
                        //error,password no son iguales
                         rd=
                                request.getRequestDispatcher(
                                "index.jsp?error=La contraseña y confirmación no son iguales");
                        rd.forward(request, response);
                    }
                break;
                case 4:
                    request.setAttribute("lista", usu.lista_usuarios());
                    //direccionamiento
                    rd=request.getRequestDispatcher("listar_usuarios.jsp");
                    rd.forward(request, response);
                break;
                case 5:
                    //capturar rut desde el cliente
                    String rut=request.getParameter("rut");
                    ArrayList<usuarios> lista=usu.consulta(rut);
                    request.setAttribute("lista",lista);
                    //direccionar
                    rd=request.getRequestDispatcher("eliminar.jsp");
                    rd.forward(request, response);
                break;
                case 6:
                    //Capturar datos del alumno
                    rut=request.getParameter("v1");
                    usu.eliminar(rut);
                    request.setAttribute("lista",usu.lista_usuarios());
                    rd=request.getRequestDispatcher("listar_usuarios.jsp");
                    rd.forward(request, response);     
                break;
                case 7:
                    request.setAttribute("cursos", usu.lista_cursos());
                    //direccionar registrate
                    rd=request.getRequestDispatcher("registrate.jsp");
                    rd.forward(request, response);
                break;
                case 8:
                    //capturar el rut desde el cliente
                    String ru=request.getParameter("ru");
                    ArrayList<usuarios> listb=usu.consulta_detalle(ru);
                    request.setAttribute("listb", listb);
                    //direccionar
                    rd=request.getRequestDispatcher("detalle_alumnos.jsp");
                    rd.forward(request, response);
                break;
                case 9:
                    //capturar el rut desde el cliente
                    String r=request.getParameter("r");
                    ArrayList<usuarios> listc=usu.consulta_detalle(r);
                    request.setAttribute("listc", listc);
                    //direccionar
                    rd=request.getRequestDispatcher("editar.jsp");
                    rd.forward(request, response);
                break;
                case 10:
                    //Capturar datos del cliente
                    String rutact=request.getParameter("v1");
                    String nombre=request.getParameter("v2");
                    String apellido=request.getParameter("v3");
                    String rutnuevo=request.getParameter("v4");
                    String direccion=request.getParameter("v5");
                    String telefono=request.getParameter("v6");
                    String correo=request.getParameter("v7");
                    //actualizar datos 
                    usu.modificar(rutact, nombre, apellido, rutnuevo, direccion,telefono,correo);
                    request.setAttribute("lista",usu.lista_usuarios());
                    rd=request.getRequestDispatcher("listar_usuarios.jsp");
                    rd.forward(request, response);
                break;
                case 11:
                    request.setAttribute("listb", pres.lista_prestamos());
                    //direccionamiento
                    rd=request.getRequestDispatcher("listar_prestamos.jsp");
                    rd.forward(request, response);
                break;
                case 12:
                    String run;
                    run=usu.getPer_rut();
                    request.setAttribute("listac", pres.lista_prestamos_alum(run));
                    //direccionamiento
                    rd=request.getRequestDispatcher("listar_prestamos_alum.jsp");
                    rd.forward(request, response);
                break;
                case 13:
                    usu.setPer_rut(request.getParameter("user"));
                    usu.setPer_contraseña(request.getParameter("pass"));
                    if(usu.verificar_admin()){
                        //crear variables de session
                        request.getSession().setAttribute("nombre2",
                                usu.getPer_nombre()+" "+
                                usu.getPer_apellido());
                        response.sendRedirect("index.jsp");
                    }else
                        response.sendRedirect("login_admin.jsp?error=Usuario o Password Incorrecto");
                break;
                case 14:
                    response.sendRedirect("login_admin.jsp");
                break;
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
