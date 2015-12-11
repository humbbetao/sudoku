/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author hgoncalves
 */
public class Controller<T> {
//    private final Controller class;
//
//    public Controller(Controller class) {
//        this.class = class;
//    }
//    quero ffazer  extensão;
//    private ControllerInterface
    
    private ControllerInterface controllerInterface;
    private ControllerSudoku controllerSudoku;

    public Controller() {
        new ControllerInterface();
    }

    public ControllerInterface getControllerInterface() {
        return controllerInterface;
    }

    public void setControllerInterface(ControllerInterface controllerInterface) {
        this.controllerInterface = controllerInterface;
    }

    public ControllerSudoku getControllerSudoku() {
        return controllerSudoku;
    }

    public void setControllerSudoku(ControllerSudoku controllerSudoku) {
        this.controllerSudoku = controllerSudoku;
    }
    
    
}
