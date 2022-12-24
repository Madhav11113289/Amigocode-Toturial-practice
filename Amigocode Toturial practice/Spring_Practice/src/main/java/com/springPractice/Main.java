// package com.springPractice;

// import java.util.List;

// import org.springframework.boot.SpringApplication;

// // @SpringBootApplication
// // @ComponentScan(basePackages = "com.springPractice")
// // @EnableAutoConfiguration
// // @Configuration
// // @RestController
// public class Main {
//     public static void main(String[] args) {
//         SpringApplication.run(Main.class, args);
//     }
//     // @GetMapping("/")
//     public simpleName sString (String s){
//             return new simpleName("A simple String");
//     }
    
//     private record simpleName(String name) {
//     }
    

//     // @GetMapping("/spring")
//     public GreetResponse greet() {
//         GreetResponse response = new GreetResponse(
//                 "Hello Spring",
//                 List.of("java", "JavaScript", "Golang"),
//                 new person("Alex",23, 300.23)
//                 );

//         return response;
                
//     }

//     record person(String name, int age, double saving) {
//     }

//     record GreetResponse(String greet,
//             List<String> favProgrammingLanguages,
//             person person) {
//     }

//     // class GreetResponse{
//     // private final String greet;

//     // public GreetResponse(String greet) {
//     // this.greet = greet;
//     // }

//     // @Override
//     // public String toString() {
//     // return "GreetResponse [greet=" + greet + "]";
//     // }

//     // @Override
//     // public int hashCode() {
//     // final int prime = 31;
//     // int result = 1;
//     // result = prime * result + getEnclosingInstance().hashCode();
//     // result = prime * result + ((greet == null) ? 0 : greet.hashCode());
//     // return result;
//     // }

//     // @Override
//     // public boolean equals(Object obj) {
//     // if (this == obj)
//     // return true;
//     // if (obj == null)
//     // return false;
//     // if (getClass() != obj.getClass())
//     // return false;
//     // GreetResponse other = (GreetResponse) obj;
//     // if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
//     // return false;
//     // if (greet == null) {
//     // if (other.greet != null)
//     // return false;
//     // } else if (!greet.equals(other.greet))
//     // return false;
//     // return true;
//     // }

//     // private Main getEnclosingInstance() {
//     // return Main.this;
//     // }

//     // public String getGreet() {
//     // return greet;
//     // }

//     // }
//     //
// }
