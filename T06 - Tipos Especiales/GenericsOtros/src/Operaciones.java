/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gorka
 */
public class Operaciones<T extends Number> {
    public int compara(T n1, T n2) {
        double diff = n1.doubleValue() - n2.doubleValue();
        return diff > 0 ? 1 : (diff < 0 ? -1 : 0);
    }
}
