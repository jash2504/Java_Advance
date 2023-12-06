/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactoryPattern;

/**
 *
 * @author hp pavailion
 */
public class factorySquare implements factoryShape {

    @Override
    public Shapes getShapes(String stye) {
        switch (stye) {
            case "Squre_2D":
                return new Square_2D();
            case "Squre_3D":
                return new Square_3D();

        }
        return null;
    }

}
