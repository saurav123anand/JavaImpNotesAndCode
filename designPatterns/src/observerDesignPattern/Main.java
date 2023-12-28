package observerDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Subject youTubeChannel=new YouTubeChannel();
        Observer aman=new Subscriber("Aman");
        Observer raman=new Subscriber("Raman");
        youTubeChannel.subscribe(aman);
        youTubeChannel.subscribe(raman);
        youTubeChannel.newVideoUploaded("Angular recap");
        youTubeChannel.newVideoUploaded("Java multithreading");

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to create new subscriber");
            System.out.println("Press 3 to exit");

            int c=Integer.parseInt(bufferedReader.readLine());
            if (c==1){
                // new video upload code
                System.out.println("Enter video title");
                String videoTitle=bufferedReader.readLine();
                youTubeChannel.newVideoUploaded(videoTitle);
            }
            else if(c==2){
                //create new subscriber
                System.out.println("Enter name of subscriber");
                String subsName=bufferedReader.readLine();
                Observer subscriber=new Subscriber(subsName);
                youTubeChannel.subscribe(subscriber);
            }
            else if(c==3){
                // exit
                System.out.println("Thank you for using app");
                break;
            }
            else {
                // exit wrong input
                System.out.println("Wrong input");
            }
        }
    }
}
