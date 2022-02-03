package ПотокиВводаВывода.Сохранение;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static String prefix = "d:" + File.separator + "Games" + File.separator;

    public static void main(String[] args) {

        File dir1 = new File(prefix + "src");
        File dir2 = new File(prefix + "res");
        File dir3 = new File(prefix + "savegames");
        File dir4 = new File(prefix + "temp");
        File dir5 = new File(prefix + "main");
        File dir6 = new File(prefix + "test");
        File dir7 = new File(prefix + "drawables");
        File dir8 = new File(prefix + "vectors");
        File dir9 = new File(prefix + "icons");

        StringBuilder report = new StringBuilder();

        if (dir1.mkdir() & dir2.mkdir() & dir3.mkdir() & dir4.mkdir() & dir5.mkdir() & dir6.mkdir() & dir7.mkdir() &
                dir8.mkdir() & dir9.mkdir())
            report.append("Каталоги созданы\n");

        File file1 = new File(dir5, "Main.java");
        File file2 = new File(dir5, "Utils.java");
        File file3 = new File(dir4, "temp.txt");

        try {
            if (file1.createNewFile() & file2.createNewFile() & file3.createNewFile())
                report.append("Файлы созданы\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter(file3, false)) {
            writer.write(String.valueOf(report));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(report);
    }
}

