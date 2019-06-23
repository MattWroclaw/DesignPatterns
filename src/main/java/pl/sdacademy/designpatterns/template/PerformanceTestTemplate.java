package pl.sdacademy.designpatterns.template;

public abstract class PerformanceTestTemplate {
   public abstract int getWarmupItereationNum();
   public abstract int getIterationNum();
   public abstract void testIteration();
   public void run(){
       for (int idx = 0; idx<getWarmupItereationNum(); idx++){
           testIteration();
       }
       final long start = System.currentTimeMillis();
       for (int idx = 0; idx<getIterationNum(); idx++){
           testIteration();
       }
       final long end = System.currentTimeMillis();
       System.out.println("Avarege time of iteration took [ms]: "+((double)(end-start))/getIterationNum());
   }
}
