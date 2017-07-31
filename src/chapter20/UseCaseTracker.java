package chapter20;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTracker {
    public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
        for (Method m : cl.getDeclaredMethods()) {
        	UseCase uc = m.getAnnotation(UseCase.class);
        	if (uc != null) {
        		System.out.println("Use: " + uc.id() + " : " + uc.description());
        		useCases.remove(uc.id());
//        		useCases.remove(new Integer(uc.id()));
        	}
        }
        
        for (int i : useCases) {
        	System.out.println("Missing : " + i);
        }
    }
    
    public static void main(String[] args) {
    	List<Integer> useCases = new ArrayList<>();
    	Collections.addAll(useCases, 47, 48, 49);
    	trackUseCases(useCases, PasswordUtils.class);
    }
}