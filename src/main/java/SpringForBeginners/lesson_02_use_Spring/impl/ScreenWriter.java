package SpringForBeginners.lesson_02_use_Spring.impl;

import SpringForBeginners.lesson_02_use_Spring.ResultWriter;

public class ScreenWriter implements ResultWriter {
    public void showResult(String str) {
        System.out.println(str);
    }
}
