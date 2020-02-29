package com.company;

/*

1117 Alternative Inheritance Chain
Arrange correctly the “chain of inheritance” in the classes: Carnivore (carnivore), Cow (cow), Dog (dog), Pig (pig), Animal (animal).

Requirements:
1. In the class Solution there must be a public class Carnivore (carnivore).
2. In the class Solution there must be a public class Cow (cow).
3. The Solution class must have a public Dog class.
4. In the class Solution there must be a public class Pig (pig).
5. The Solution class must have a public Animal class.
6. The Carnivore class must be inherited from the Animal class.
7. The Cow class must be inherited from the Animal class.
8. The Dog class must be inherited from the Carnivore class.
9. The Pig class must be inherited from the Animal class.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
    }
    public class Carnivore extends Animal {
    }
    public class Dog extends Carnivore {
    }

    public class Cow extends Animal {
    }
    public class Pig extends Animal {
    }
    public class Animal {
    }
}
