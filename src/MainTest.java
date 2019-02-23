import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
    public void count() {
    Main c=new Main();
    int z =0;
    int y=0;
        for (int i=0;i<4;i++){
             c.func(1);
             c.func2(50);
        }
    for(int i=0;i<c.count.size();i++){
        z=z+c.count.get(i);
        y=y+c.price.get(i);
    }
    assertEquals(4,z);
    assertEquals(200, y);
    }
     
     
     @Test
        public void count2() {
            Main c=new Main();
        int z =0;
       
        for(int i=0;i<c.count.size();i++){
            z=z+c.count.get(i);
           
        }
        assertEquals(0,z);
        }

}
