import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Date;


public class WeatherServlet extends HttpServlet {

PrintWriter out;

   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException{
   	//api key: AIzaSyD4Ydc-Uq0N1Tnl9bQZFI0mhK3vcko_5Yk

	   public static final String GOOGLE_API_KEY = AIzaSyD4Ydc-Uq0N1Tnl9bQZFI0mhK3vcko_5Yk;

		out = response.getWriter();
         try {
         	out.println("<html>");
         	out.println("<head><title>Weather App</title><style>#map {height: 400px;  width: 100%;  }</style></head>");
         	out.println("<body>");
         	out.println("<div id=\"map\"></div><script>function initMap() {var uluru = {lat: -25.344, lng: 131.036};var map = new google.maps.Map(document.getElementById('map'), {zoom: 4, center: uluru});var marker = new google.maps.Marker({position: uluru, map: map});}</script><script async defer src=\"https://maps.googleapis.com/maps/api/js?key=" + GOOGLE_API_KEY + "&callback=initMap\"></script>");

         	out.println("<h1>Winter is coming</h1>"); 

         	out.println("</body></html>");

         }finally {
         	out.close();  // Always close the output writer
      	}
    }


}