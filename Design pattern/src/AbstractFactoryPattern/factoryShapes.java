/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactoryPattern;

/**
 *
 * @author hp pavailion
 */
public class factoryShapes implements factoryShape {

    @Override
    public Shapes getShapes(String stye) {
        switch (stye) {
            case "Circle_2D":
                return new Circle_2D();
            case "Circle_3D":
                return new Circle_3D();

        }
        return null;
    }
}
