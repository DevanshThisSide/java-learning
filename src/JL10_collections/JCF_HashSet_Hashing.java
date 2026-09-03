package JL10_collections;

public class JCF_HashSet_Hashing {

    public static void main(String[] args) {

//           PART 1: CUSTOM OBJECTS AND HASHSET

//           HashSet can store objects created from our own classes.
//           Example:
//           HashSet<Student> students = new HashSet<>();
//           But there is an important problem:
//           If we create two separate Student objects having the same
//           data, Java does not automatically know that they should be considered equal.
//           This is where equals() and hashCode() become important.

        Student s1 = new Student(1, "Devansh");
        Student s2 = new Student(1, "Devansh");

//           s1 and s2 contain the same data:
//           s1 → rollNo = 1, name = Devansh
//           s2 → rollNo = 1, name = Devansh
//           But they are still TWO separate objects.
//           s1 == s2
//           checks whether both references point to the exact same object.
//           Therefore:
//           s1 == s2 → false

        System.out.println("s1 == s2 : " + (s1 == s2));

//           PART 2: equals()

//           equals() is used to define when two objects should be considered logically equal.
//           In our Student class, we have decided:
//           Two Students are equal if their rollNo is equal.
//           Therefore:
//           s1.equals(s2)
//           will return true because:
//           s1.rollNo = 1
//           s2.rollNo = 1

        System.out.println("s1.equals(s2) : " + s1.equals(s2));


//           PART 3: hashCode()

//           hashCode() returns an integer value associated with an object.
//           Hash-based collections such as HashSet and HashMap use
//           hash codes as part of their internal lookup process.
//           We can call hashCode() like this:

        System.out.println("s1 hashCode : " + s1.hashCode());
        System.out.println("s2 hashCode : " + s2.hashCode());

//           Since our equals() method considers two Students equal
//           when their rollNo is equal, our hashCode() is also based on rollNo.
//           Therefore:
//           If:
//           s1.equals(s2) → true
//           then:
//           s1.hashCode() == s2.hashCode() must also be true.

//           PART 4: WHY DO WE NEED BOTH?

//           hashCode() and equals() have DIFFERENT jobs.
//           hashCode()
//           → Helps the collection find the possible location of an object quickly.
//           equals()
//           → Confirms whether two objects are actually equal.
//           Think of it as:
//           hashCode() → SHORTLIST
//           equals()   → FINAL CONFIRMATION


//           Conceptual flow:
//                    Object
//                       ↓
//                   hashCode()
//                       ↓
//                Find possible bucket
//                       ↓
//                 Possible match?
//                       ↓
//                    equals()
//                    /      \
//                 true      false
//                  ↓           ↓
//             Duplicate      Add

//           We do NOT normally write:
//           if (s1.hashCode() == s2.hashCode()) to check whether two objects are equal.
//           HashSet performs the hashing and equality checking internally.

//           PART 5: GOLDEN RULE OF hashCode() AND equals()
//
//           If two objects are equal according to equals(), they MUST have the same hashCode().
//           Therefore:
//           a.equals(b) == true
//                        ↓
//           a.hashCode() == b.hashCode()
//
//           BUT the reverse is NOT guaranteed:
//           a.hashCode() == b.hashCode() does NOT necessarily mean:
//           a.equals(b) == true because different objects can have the same hash code.
//           This situation is called a HASH COLLISION.

//           PART 6: HASHING

//           Hashing is a technique of converting data/object
//           information into a numerical value called a hash value or hash code.
//           Basic idea:
//                 Object / Data
//                       ↓
//                  Hash Function
//                       ↓
//                  Hash Value
//           Example:
//                   "Devansh"
//                       ↓
//                    hashCode()
//                        ↓
//                 integer value

        String name = "Devansh";
        System.out.println("String hashCode : " + name.hashCode());

//           PART 7: HASH FUNCTION

//           A hash function is an algorithm/function that takes some input and produces a hash value.
//           Conceptually:
//                 h(data)
//                    ↓
//                hash value
//           A good hash function should:
//           1. Be reasonably fast.
//           2. Distribute objects well.
//           3. Reduce unnecessary collisions.
//           4. Produce the same hash value for equal objects.

//           PART 8: HASH VALUE / HASH CODE
//           The numerical result produced by a hash function is commonly called a hash value or hash code.
//           In Java, hashCode() returns an int.
//           Example :  int hash = object.hashCode();

//           PART 9: HASH TABLE
//
//           A HASH TABLE is a data structure that stores data using hashing so that elements can be located efficiently.
//           Think of a hash table as a collection of buckets/slots:
//           Bucket 0 → [ ]
//           Bucket 1 → [ ]
//           Bucket 2 → [ ]
//           Bucket 3 → [ ]
//           Bucket 4 → [ ]
//           Bucket 5 → [ ]
//           ...
//           When an object is inserted:
//                 Object
//                    ↓
//                hashCode()
//                    ↓
//               Hashing process
//                    ↓
//                 Bucket
//                    ↓
//                  Store
//           When searching:
//                 Object
//                    ↓
//                hashCode()
//                    ↓
//               Possible bucket
//                    ↓
//                 Check object
//                    ↓
//                 equals()

//           PART 10: BUCKET
//           A BUCKET is basically a storage location/group inside a hash table where objects having
//            a particular hash mapping can be stored.
//           Conceptually:
//           Hash Table
//                │
//                ├── Bucket 0
//                ├── Bucket 1
//                ├── Bucket 2
//                ├── Bucket 3
//                └── ...
//           hashCode() helps determine the possible bucket/location
//           where an object should be stored or searched.

//           PART 11: HASH COLLISION
//
//           A HASH COLLISION occurs when two different objects/data produce the same hash value or map to the same bucket.
//           Example:
//           Object A
//               ↓
//           hashCode()
//               ↓
//              25
//           Object B
//               ↓
//           hashCode()
//               ↓
//              25
//           Object A and Object B may still be DIFFERENT objects.
//           Same hash code does NOT mean same object.


//           PART 12: HOW COLLISION IS HANDLED
//
//           Java's hash-based collections need a way to deal with
//           multiple objects mapping to the same bucket.
//
//           Two major general hashing approaches are:
//           1. Separate Chaining
//           2. Open Addressing
//
//           1. SEPARATE CHAINING
//           Multiple elements that map to the same bucket are kept together in a chain/structure.
//           Bucket 5
//               ↓
//           Object A → Object B → Object C
//           2. OPEN ADDRESSING
//           If the calculated location is occupied, another available location is searched.
//           Common techniques include:
//           a) Linear Probing -> +1 - +2 - +3 - +4 - ...
//           b) Quadratic Probing -> +1  2 - 2  2 - 3  2 - ...
//           c) Double Hashing -> another hash function to get step size


//           PART 13: LINEAR PROBING
//          
//           If the calculated bucket is occupied, check the next
//           bucket one by one until an empty location is found.
//           Example:
//           Bucket 5 → occupied
//           Bucket 6 → occupied
//           Bucket 7 → empty
//           Object is stored in Bucket 7.
//           Concept:
//           h(x)
//            ↓
//           5 → 6 → 7
//                     ↓
//                   Store

//           PART 14: QUADRATIC PROBING
//         
//           Instead of checking the next bucket one by one, the
//           positions are searched using increasing square-based jumps.
//           Conceptually:
//           h(x)
//             ↓
//           h + 1²
//           h + 2²
//           h + 3²
//           ...
//           This is another general collision-handling technique.


//           PART 15: DOUBLE HASHING
//         
//           Double hashing uses a second hash function to determine
//           the jump distance when a collision occurs.
//           Conceptually:
//           First Hash
//                +
//           Second Hash
//                ↓
//           Next possible position
//           These probing techniques are general hashing concepts.
//           We do not need to implement them ourselves while learning
//           Java Collections.


//           PART 16: HASHSET INTERNAL CONCEPT
//         
//           HashSet is a hash-based Set implementation.
//           At a high level:
//           HashSet
//              ↓
//           uses HashMap internally
//              ↓
//           hash table structure
//              ↓
//           hashCode()
//              ↓
//           bucket
//              ↓
//           equals() when required
//           This is why the word "Hash" appears in HashSet.

//           PART 17: HASHSET ADD OPERATION - CONCEPTUAL FLOW
//         
//           Suppose:
//           students.add(s2);
//           Conceptually:
//                       s2
//                        ↓
//                   hashCode()
//                        ↓
//                 Find possible bucket
//                        ↓
//                 Existing object?
//                        ↓
//                     equals()
//                    /       \
//                 true       false
//                  ↓            ↓
//             Don't add        Add
//           hashCode() helps narrow down where to look.
//           equals() performs the final equality check.

//           PART 18: WHY hashCode() AND equals() ARE BOTH OVERRIDDEN
//         
//           When creating custom classes that will be used in
//           HashSet/HashMap, we should properly define:
//                 equals()
//                    +
//                 hashCode()
//           equals()
//           → Defines logical equality.
//           hashCode()
//           → Produces a hash value consistent with that equality.
//           If equals() says:
//           Same rollNo = equal Student
//           then hashCode() should also be based on rollNo.

//                            HASHING
//                               ↓
//                          hashCode()
//                               ↓
//                          Hash Value
//                               ↓
//                           Hash Table
//                               ↓
//                            Bucket
//                               ↓
//                         Possible Match
//                               ↓
//                            equals()
//                       ┌───────┴───────┐
//                       ↓               ↓
//                     true            false
//                       ↓               ↓
//                  Duplicate          Add
//
//           Remember:
//           Hashing   → Technique
//           Hash code → Numerical result
//           Hash table → Data structure
//           Bucket     → Storage location/group
//           Collision  → Different objects mapping to same location
//           equals()   → Final equality comparison

//           IMPORTANT POINTS TO REMEMBER

//           1. Hashing converts data/object information into a hash
//              value.
//           2. hashCode() returns an integer hash value in Java.
//           3. A hash table stores data using hashing.
//           4. A bucket is a location/group inside a hash table.
//           5. Different objects can have the same hash code.
//           6. Same hash code does NOT necessarily mean objects are equal.
//           7. If equals() returns true, hashCode() MUST return the same value for both objects.
//           8. HashSet uses hashing internally.
//           9. HashSet uses HashMap internally.
//           10. hashCode() helps find the possible location.
//           11. equals() confirms whether objects are actually equal.
//           12. Collision means different objects map to the same hash location.
//           13. Separate chaining and open addressing are general collision-handling approaches.
//           14. Linear probing, quadratic probing and double hashing are open-addressing techniques.
    }
}


//   CUSTOM STUDENT CLASS
//   This class is used to demonstrate why equals() and hashCode()
//   are important when custom objects are stored in HashSet.
//   Our rule: Two Student objects are considered equal when their rollNo is equal.

class Student {

    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

//       equals()     
//       equals() defines what it means for two Student objects
//       to be logically equal.
//       @Override
//       We are overriding the equals() method inherited from the Object class.
//
//       Object obj
//       Object is the parent class of all Java classes.
//       Therefore, an object of any class can be passed here.
//       When: s1.equals(s2)
//       this → s1
//       obj  → s2
//
//       if (this == obj)
//       Checks whether both references point to the exact same object.
//       If yes, they are obviously equal.
//
//       if (obj == null || getClass() != obj.getClass())
//       Checks:
//       1. Is obj null?
//       2. Is obj from a different class?
//       If either is true, objects are not equal.
//
//       Student student = (Student) obj;
//       obj is currently treated as an Object.
//       Since we already confirmed that obj is a Student,
//       we cast it to Student so that we can access:
//       student.rollNo
//       return rollNo == student.rollNo;
//       This is our actual equality rule.
//       Two Students are equal if their roll numbers are equal.

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student student = (Student) obj;

        return rollNo == student.rollNo;
    }

//       hashCode() returns an integer hash value for the object.
//       Since our equals() method defines equality using rollNo, our hashCode() also uses rollNo.
//       Therefore:
//       Same rollNo
//            ↓
//       equals() → true
//            ↓
//       same hashCode()
//       Integer.hashCode(rollNo)
//       Generates the hash code based on the integer rollNo.

    @Override
    public int hashCode() {
        return Integer.hashCode(rollNo);
    }
}