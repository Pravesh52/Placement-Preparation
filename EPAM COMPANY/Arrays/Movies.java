public class Movies {
    class movie{
        String moviename;
        String date;
        int views;

        movie(String moviename,String date,int views){
            this.moviename=moviename;
            this.date=date;
            this.views=views;
        }

        void displaymoviename(String moviename){
            System.out.println("Moviename: "+moviename+" date"+date+" views "+views);
        }

    }
    public static void main(String[] args) {
        
    }
}
