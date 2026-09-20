package JL14_file_handling;

import java.io.File;
import java.io.IOException;

/*
 *              FILE HANDLING - BASICS
 *
 * File handling allows a Java program to work with files and
 * directories stored on the computer.
 *
 * The java.io.File class represents the path of a file or
 * directory. Creating a File object does NOT automatically
 * create the actual file on the disk.
 *
 * Example:     File file = new File("notes.txt");
 * Here, 'file' represents the path "notes.txt".
 *
 * Important File concepts:
 * 1. Relative Path     - Path relative to the program's current working directory.
 * 2. Absolute Path     - Complete path of a file/directory.
 * 3. File              - Represents a file path.
 * 4. Directory         - A folder that can contain files and other directories.
 *
 * Important File methods:
 * exists()          -> checks whether path exists
 * createNewFile()   -> creates a new file
 * getName()         -> returns file/directory name
 * getPath()         -> returns specified path
 * getAbsolutePath() -> returns complete absolute path
 * isFile()          -> checks whether path is a file
 * isDirectory()     -> checks whether path is a directory
 * length()          -> returns file size in bytes
 * mkdir()           -> creates one directory
 * mkdirs()          -> creates directory hierarchy
 * delete()          -> deletes file/directory
 * list()            -> returns names inside a directory
 * listFiles()       -> returns File objects inside a directory
 *
 * File class mainly deals with file/directory information
 * and paths. It is not primarily responsible for reading or
 * writing file contents.
 *
 * Reading/writing will be covered in the next files.
 */

public class FileBasics {

    public static void main(String[] args) throws IOException {

        // 1. Creating a File object using a relative path

        File file = new File("src/JL14_file_handling/notes.txt");

        System.out.println("File Name : " + file.getName());
        System.out.println("File Path : " + file.getPath());
        System.out.println("Absolute Path : " + file.getAbsolutePath());

        // 2. Checking whether the file exists

        System.out.println("File Exists : " + file.exists());

        // 3. Creating the actual file
        // new File() only represents the path.
        // createNewFile() actually creates the file on disk.

        if (!file.exists()) {
            boolean created = file.createNewFile();
            System.out.println("File Created : " + created);
        } else {
            System.out.println("File already exists.");
        }

        // 4. Checking whether it is a file or directory

        System.out.println("Is File : " + file.isFile());
        System.out.println("Is Directory : " + file.isDirectory());

        // 5. Getting file size
        // length() returns the size in bytes.

        System.out.println("File Size : " + file.length() + " bytes");

        // 6. Creating a directory

        File directory = new File("src/JL14_file_handling/documents");

        if (!directory.exists()) {
            boolean created = directory.mkdir();
            System.out.println("Directory Created : " + created);
        }

        // 7. Creating a directory hierarchy
        // mkdirs() creates required parent directories too.

        File directoryStructure = new File("src/JL14_file_handling/data/java/programs");

        if (!directoryStructure.exists()) {
            boolean created = directoryStructure.mkdirs();
            System.out.println("Directory Structure Created : " + created);
        }

        // 8. Listing directory contents

        System.out.println("\nContents of current directory:");

        File currentDirectory = new File(".");
        // The dot "." is a standard system shortcut for the current folder.
        // The folder it targets depends on where your JVM (Java Virtual Machine) was launched.
        // This is usually your root project folder.

        // List all files inside the current folder
        String[] contents = currentDirectory.list();

        if (contents != null) {
            for (String item : contents) {
                System.out.println(item);
            }
        }

        // 9. Getting File objects using listFiles()

        System.out.println("\nFile objects in current directory:");

        File[] files = currentDirectory.listFiles();

        if (files != null) {
            for (File item : files) {
                System.out.println(item.getName());
            }
        }

        // 10. Deleting a file
        // Uncomment this section if you want to delete the file created above.
        // boolean deleted = file.delete();
        // System.out.println("File Deleted : " + deleted);
    }
}