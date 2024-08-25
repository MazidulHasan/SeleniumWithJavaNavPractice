package com.seleniumwithjavanavpractice.Wait;

public class WaitConcept {
    public static void main(String[] args) {
        // wait 2 types
        // 1. Static wait :: Thread.sleep()
        // 2. Dynamic wait :: 
                //a. Implicit wait : Global wait for all the web element
                //b. Explicit wait : for a specific web element
                    // i: WebDriverWait (class)
                    //ii: FluentWait (class)
        // There is wait interface
            // until() --> has a child class fluentwait
            // so it is has some extrac methods 
            // finally it generates webdriverWait

    }
}
