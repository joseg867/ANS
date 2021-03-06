/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author raziel
 */
public class NoTerminal extends Elemento
{
    protected ArrayList _primeros;
    protected ArrayList _siguientes;
    public boolean _anulable;
    
    /**
     * Constructor.
     * 
     * @param simbolo Letra que tendrá el terminal.
     */
    private NoTerminal(String simbolo)
    {
        super(simbolo, Tipo.no_terminal);
        _anulable = false;
        _primeros = new ArrayList();
        _siguientes = new ArrayList();
    }
    
    private NoTerminal(NoTerminal noTerminal)
    {
        super(noTerminal._simbolo, noTerminal._tipo);
        _anulable = noTerminal._anulable;
        _primeros = noTerminal._primeros;
        _siguientes = noTerminal._siguientes;
    }
    
    public ArrayList primeros()
    {
        return _primeros;
    }
    
    public void primeros(ArrayList p)
    {
        Iterator it = p.iterator();
        while(it.hasNext())
        {
            _primeros.add(it.next());
        }
    }

    public ArrayList siguientes()
    {
        return _siguientes;
    }

    public void siguientes(ArrayList s)
    {
        Iterator it = s.iterator();
        while(it.hasNext())
        {
            _siguientes.add(it.next());
        }
    }
    
    public static Elemento crearNoTerminal(String simbolo)
    {
        if(mElementos.get(simbolo) == null)
        {
            return new NoTerminal(simbolo);
        }
        else return mElementos.get(simbolo);
    }
    
    @Override
    public String toString()
    {
        return "<" + _simbolo + ">";
    }
}
