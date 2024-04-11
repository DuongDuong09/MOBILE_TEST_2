package report;

import com.aventstack.extentreports.annotations.MarkupIgnore;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyCustomLog {
        private List<Object> names = Arrays.asList("Anshoo", "Extent", "Klov");
        private Object[] favStack = new Object[]{"Java", "C#", "Angular"};
        @MarkupIgnore
        private List<Object> ignored = Arrays.asList("Ignored", "Ignored", "Ignored");
        private Map<Object, Object> items = new HashMap<Object, Object>() {
            {
                put("Item1", "Value1");
                put("Item2", "Value2");
                put("Item3", "Value3");
            }
        };
}
