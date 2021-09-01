package bin;

import de.informatics4kids.*;

import java.awt.Color;

public class Main {
    public static void main(String[]args) {

        Picture picture = new Picture("D:/Downloads/eq75yvnzjvj71.jpg");

        String filename = "D:/Downloads/eq75yvnzjvj71.jpg";
        String[] filename_array = {filename,filename,filename};

        Picture[] rgb = new Picture[3];

        for (int i = 0; i < 3; i++){
            rgb[i] = new Picture(filename_array[i]);
        }


        for (int i = 0; i < picture.widthX(); i++) {
            for (int j = 0; j < picture.heightY(); j++){
                rgb[0].setColor(i,j,new Color(picture.getColor(i,j).getRed(),0,0));
                rgb[1].setColor(i,j,new Color(0,picture.getColor(i,j).getGreen(),0));
                rgb[2].setColor(i,j,new Color(0, 0, picture.getColor(i,j).getBlue()));
            }
        }

        PictureViewer pictureViewer = new PictureViewer(picture.getPicture());
        pictureViewer.show();

        PictureViewer[] pictureViewers = new PictureViewer[]{
                new PictureViewer(rgb[0].getPicture()),
                new PictureViewer(rgb[1].getPicture()),
                new PictureViewer(rgb[2].getPicture())};

        for (int i = 0; i < 3; i++){
            pictureViewers[i].show();
        }

    }
}
