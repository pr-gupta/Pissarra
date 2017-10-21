package co.pissarra;

import co.pissarra.util.dagger.component.DaggerAppComponent;

public class Main {
    public static void main(String[] args) {
        DaggerAppComponent.builder().build().sparkSetup().init();
    }
}
