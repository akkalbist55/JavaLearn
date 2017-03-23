class Computer {
  Computer() {
    System.out.println("This is Computer class.");
  }
 
  void computer_method() {
    System.out.println("1% Battery Shut down my PC ...");
  }
 
  public static void main(String[] args) {
    Computer my = new Computer();
    Laptop your = new Laptop();
    Probook our = new Probook();
    Macbook has = new Macbook();
    Supercomputer her = new Supercomputer();
    Personalcomputer is = new Personalcomputer();
 
    my.computer_method();
    your.laptop_method();
    our.probook_method();
    has.macbook_method();
    her.supercomputer_method();
    is.personalcomputer_method();
  }
}
 
class Laptop {
  Laptop() {
    System.out.println("This is Laptop class.");
  }
 
  void laptop_method() {
    System.out.println("10% Battery available.");
  }
} 


class Probook {
  Probook() {
    System.out.println("This is Probook class.");
  }
 
  void probook_method() {
    System.out.println("20% Battery available.");
  }
} 

class Macbook {
  Macbook() {
    System.out.println("This is Macbook class.");
  }
 
  void macbook_method() {
    System.out.println("30% Battery available.");
  }
} 


class Supercomputer {
  Supercomputer() {
    System.out.println("This is Supercomputer class.");
  }
 
  void supercomputer_method() {
    System.out.println("40% Battery available.");
  }
} 

class Personalcomputer {
  Personalcomputer() {
    System.out.println("This is Personalcomputer class.");
  }
 
  void personalcomputer_method() {
    System.out.println("50% Battery available.");
  }
} 


