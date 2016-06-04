package tel_ran.view;

public interface DataProvider {
void showMessage(String message);
String getString(String prompt,String stringPatterns[]);
int getInteger(String prompt, int minValue, int maxValue);
}
