package com.test.button.factories;

public class DemoApplication {
    public static String WINDOWS_TYPE = "WINDOWS_TYPE";
    public static String MACOS_TYPE = "MACOS_TYPE";


    public static Application ConfigureApplication(String type) {
        public Application ConfigureApplication(String type){
            Application app;
            Application.GUIFactory factory;
            if (type.equals(WINDOWS_TYPE)) {factory=new WindowsFactory();}
            else {
                factory = new MacOsFactory();
            }
            app = new Application(factory);
            return app;
        }
    }
}
