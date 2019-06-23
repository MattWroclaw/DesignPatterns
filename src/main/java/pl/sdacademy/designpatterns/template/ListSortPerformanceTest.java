package pl.sdacademy.designpatterns.template;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ListSortPerformanceTest extends PerformanceTestTemplate {
    @Override
    public int getWarmupItereationNum() {
        return 3;
    }

    @Override
    public int getIterationNum() {
        return 100;
    }

    @Override
    public void testIteration() {
    final List<Integer> numbers = new ArrayList<>();
    for (int idx = 0; idx<10000; idx++){
        numbers.add(new Random().nextInt());
    }
    numbers.sort(Comparator.naturalOrder());
    }
}
