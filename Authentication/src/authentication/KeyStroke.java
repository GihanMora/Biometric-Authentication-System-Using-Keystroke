package authentication;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
public class KeyStroke {
    //keep arraylists for different time sets
    ArrayList <Long> times=new ArrayList<Long>();
    ArrayList <Long> press_times=new ArrayList<Long>();
    ArrayList <Long> fly_times=new ArrayList<Long>();
    ArrayList <Long> dur=new ArrayList<Long>();
    ArrayList <Long> releases=new ArrayList<Long>();
    ArrayList <Integer> codes=new ArrayList<Integer>();
    public KeyStroke() {
        
    }
    public float mean(ArrayList<Long> durations){//method for getting mean from given set
            float sum=0;
            for(Long i : durations){
                sum+=i;
            }
            float meanValue=sum/(durations.size());
            return meanValue;
        
    
    }
    public void press(java.awt.event.KeyEvent keyEvent) {
        Long press_time = System.currentTimeMillis();//System.nanoTime();
        int code = keyEvent.getKeyCode();
        times.add(press_time);
        press_times.add(press_time);
        if(press_times.size()>1){
        Long fly=press_time-press_times.get(press_times.indexOf(press_time)-1);
        fly_times.add(fly);
        }

       
        

    }

    public void release(java.awt.event.KeyEvent keyEvent) {
        Long release_time = System.currentTimeMillis();
        int code = keyEvent.getKeyCode();
        times.add(release_time);
        releases.add(release_time);
            codes.add(code);
            long dura=release_time-times.get(times.indexOf(release_time)-1);
            dur.add(dura);
            
           

       
        

            
    }


    
}
