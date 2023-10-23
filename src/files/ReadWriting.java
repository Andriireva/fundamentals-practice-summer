package files;

import collections.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


// java.io package relates to input and out stream
public class ReadWriting {

    public List<String> readSimpleFile() {
        // When u work with files you MUST remmber that Windows and Unix based system
        // uses different slashes

        String filePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "testfile.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath)); // throws FileNotFoundException
            // .readLine() it returns 1st line of the file and move pointer to the next line
//            String firstLineRead = reader.readLine(); // throws IOException
//            String secondLineRead = reader.readLine(); // throws IOException
//            String thirdLIne = reader.readLine();
//            String forth = reader.readLine(); // null
//            System.out.println(firstLineRead);
//            System.out.println(secondLineRead);
//            System.out.println(thirdLIne);
//            System.out.println(forth);

            return reader.lines()
                    .filter(line -> line != null && !line.isBlank())
                    .map(line -> line.toUpperCase())
                    .collect(Collectors.toList());

        } catch (IOException e) {
            System.out.println("File not found " + e.getMessage());
        }
        return new ArrayList<>();
    }

    public List<Person> readPersonsFile(String separator) {
        String filePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "persons.txt";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath)); // throws FileNotFoundException
            return reader.lines()
                    .filter(line -> line != null && !line.isBlank())
                    .map(line -> line.split(separator))
//                    .peek(res -> System.out.println(res.length))
                    .map(values -> new Person(values[1], Long.valueOf(values[0])))
                    .collect(Collectors.toList());


        } catch (IOException e) {
            System.out.println("File not found " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
            }
        }
        return new ArrayList<>();
    }

    public void writePersons(Collection<Person> persons, String delimiter) {
        String filePath = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "personsOutput.txt";
        try {
            // It calls try with resources
            try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
                String personsString = persons.stream()
                        .filter(person -> person != null)
                        .map(person -> person.getName() + delimiter + person.getId())
                        .collect(Collectors.joining("\n"));
                outputStream.write(personsString.getBytes()); // personsString.getBytes() - represent String by bytes
                outputStream.write("\nmy custom data".getBytes());
            }
        } catch (IOException e){
            System.out.println("Something  wrong" + e.getMessage());
        }
    }


}
