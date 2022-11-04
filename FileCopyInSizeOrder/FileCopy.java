package filelistcopy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class FileCopy {
    private FileWriter fileWriter;
    private FileReader fileReader;
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;
    private File readFile;
    private File writeFile;

    public static void main(String[] args) {
        FileCopy fileCopy = new FileCopy();
        fileCopy.programPage();
    }

    private void programPage() {
        readFile = new File("C:\\Users\\HP\\IdeaProjects\\javascript");
        int index = 0, fileListSize = 0, tempCheckSize = 0;
        PriorityQueue<Integer> fileSizeQueue = new PriorityQueue<>();
        File[] files = readFile.listFiles();
        fileListSize = files.length;
        ArrayList<File> fileArrayList = new ArrayList<>(Arrays.asList(files));
        for (index = 0; index < fileListSize; index++) {
            fileSizeQueue.add((int) (files[index].length()));
        }
        System.out.println(fileSizeQueue);
        while (!fileSizeQueue.isEmpty()) {
            for (index = 0; index < fileArrayList.size(); index++) {
                tempCheckSize = (int) fileArrayList.get(index).length();
                if (tempCheckSize == fileSizeQueue.peek()) {
                    try {
                        fileReader = new FileReader(fileArrayList.get(index));
                        bufferedReader = new BufferedReader(fileReader);
                        System.out.println(tempCheckSize);
                        writeFile = new File("C:\\Users\\HP\\IdeaProjects\\createfile\\" + fileArrayList.get(index).getName());
                        writeFile.createNewFile();
                        fileWriter = new FileWriter(writeFile);
                        bufferedWriter = new BufferedWriter(fileWriter);
                        String line = "", fileCopy = "";
                        line = bufferedReader.readLine();
                        while (line != null) {
                            System.out.print(line + "\n");
                            fileCopy += (line + "\n");
                            line = bufferedReader.readLine();
                        }
                        bufferedWriter.write(fileCopy);
                        bufferedWriter.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(fileArrayList.get(index).getName());
                    fileArrayList.remove(index);
                    System.out.println("Completed");
                    break;
                }
            }
            fileSizeQueue.poll();
        }
    }
}
