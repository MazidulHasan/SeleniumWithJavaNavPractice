package com.seleniumwithjavanavpractice.Locator;

public class CSSSelectors {
    public static void main(String[] args) {
        // id
        // #id
        // tagname#id
        // #username
        // input#username
        
        // class:
        // .class
        // tagname.class
        // .login-email
        // input.login-email

        // class + id
        // .class#id
        // #id.class
        // input.login-email#username
        // input#usernae.login-email

        // .c1.c2.c3.....cn
        // tagname.c1.c2.c3.c4
        // .c1#id.c2
        // input.classname#id.classname2
        // tagname[att='value'] -> cssSelector
        // //tagname[@att='value'] -> Xpath
        // in cssSelector there is no // and @ symbols

        // start with anything (^)
        // input[placeholder='E-mail'] -> here match that place holder that start with E-mail
        // input[placeholder=*E-mail'] -. contails
        // input[placeholder=$E-mail'] -> ends with

        // text in CSS-> Not available in CSS -> this is the drawback
        
        // Parent to child (>)
        // form#id > div ----> direct child
        // form#id div  ----> direct + indirect child

        // Dropdown with CSS
        // select#Form_id > option

        // child to parent (Backword traversing ) -> Not allowed in cssSelector
        // child to ancstor -> Not allowed in cssSelector
        // preceding sibling -> Not allowed in cssSelector

        // sibling in CssSelector(+)
        // label[for='input-eail']+input#input-email -> selects immediate sibling
        
        // all following sibling (~)
        // option[value='Algeria']~option

        // comma in css (selects multiple different webelement)
        // input#use1,input#pass,input#loginBtn
        // if we combine all and want to send data then we can use it
        // or to check if all the element count is availalbe or not (Sanity test)

        // not in css
        // div.form-group > input.form-contro:not(#input-pass)
        // here for the first part (div.form-group > input.form-contro) there is two matchs, i need 
        // to exclude one then i need to use not(name of the class that i do not want)
        // If we want to go to the nth place(x) then >
        //  .......option:nth-of-type(x)

        // first child
        // ....option:first-child




        //                          xpath           vs          css
        // 1. performance:          good                        good             
        // 2. Syntax:               complex                     simple
        // 3. Backword              yes                         No
        // 4. sibling               yes                         yes(Only following)\
        // 5. text                  yes                         no
        // 6. ancestor/parent       yes                         no
        // 7. ends-with             no                          yes
        // 8. index                 yes                         yes+1
        // 9. not                   yes                         yes
        // 10. comma                no                          yes
        // 11. SVG                  yes                         no
        // 12. shadowDOM            no                          yes
        // 13. Psudo                no                          yes
        // 14. first                no                          yes
        
        
        // major drawback of css
        // text, parent-child, ancestor, preceding
    }
}
