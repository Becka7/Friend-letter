import static spark.Spark.*;
public class App {
     public static void main(String[] args) {
         staticFileLocation("/public");
        get("/",(request, response) ->

        "<!DOCTYPE html>" +
         "<html>" +
                 "<head>" +
                 "<title>Hello</title>" +
                 "<link rel='stylesheet' + href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
                 "</head>" +
                 "<body>" +
                 "<h1>Hi there mate!....my name is Rabecca </h1>" +
                 "<p>Dear Friend,</p>" +
                 "<p>How are you? I hope that you are having a nice weekend. I'm vacationing in the Iceland while I learn programming! </p>" +
                 "<p>Friend, you would not believe how cold it is here. I should have gone to Hawaii instead.</p>" +
                 "<p>But I like programming a lot, so I've got that going for me. </p>" +
                 "<p>Looking forward to seeing you soon. I'll bring you back a souvenir. </p>" +
                 "<p>Cheers,</p>" +
                 "<p> <a href ='/favourite-photos'>Checkout some of the photos i took</a> </p>"+
                 "<p>Travel Enthusiast Jane</p>" +
                 "</body>" +
                 "</html>"
        );
        get("/favourite-photos",(request, response) ->
        "<!DOCTYPE html>"+
                "<html>" +
                "<head>" +
                "<title> Pictures </title>"+
                "<link rel='stylesheet' + href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
                "</head>"+
                "<body>" +
                "<h1>Photos from the trip</h1>"+
                "<ul>" +
                "<li><img src = '/images/javaimage.jpeg' alt='A photo of a mountain range.'/> </li>"+
                "<li><img src = '/images/image2.jpeg'/> </li>"+
                "</ul>"+
                "</body>"+
                "</html>"

        );

    };
}
