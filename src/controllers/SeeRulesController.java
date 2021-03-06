package controllers;

import core.GameMaster;
import gui.SeeRules;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Class providing the <b>controller</b> for the processes related to <b>seeing the
 * rules of the game</b>
 */
public class SeeRulesController implements ActionListener, WindowListener {
    /**
     * Graphical user interface for seeing the rules of the game
     */
    private SeeRules displayScr;
    /**
     * Central class providing access to all the methods necessary to play the game
     */
    private GameMaster game;

    /**
     * Creates a controller object with the rules GUI and the
     * game master as parameters
     *
     * @param displayScr graphical user interface of the welcome screen
     * @param game game master (providing access to all the methods
     *             necessary to play the game)
     */
    public SeeRulesController(SeeRules displayScr, GameMaster game) {
        this.displayScr = displayScr;
        this.game = game;

        displayScr.setVisible(true);
        displayScr.setWindowListener(this);
        displayScr.setActionListener(this);
    }

    /**
     * Invoked when the Window is set to be the active Window
     *
     * @param e window event indicative of a change in status
     */
    @Override
    public void windowActivated(WindowEvent e) {

    }

    /**
     * Invoked when a window has been closed as the result of calling dispose on the window
     *
     * @param e window event indicative of a change in status
     */
    @Override
    public void windowClosed(WindowEvent e) {

    }

    /**
     * Invoked when a window is no longer the active window
     *
     * @param e window event indicative of a change in status
     */
    @Override
    public void windowDeactivated(WindowEvent e) {
        /* Remove the window from display if the user clicks on any area outside it
        since it is no longer the active window and it is a non-essential window. */
        displayScr.setVisible(false);
    }

    /**
     * Invoked when a window is changed from a minimized to a normal state
     *
     * @param e window event indicative of a change in status
     */
    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    /**
     * Invoked when a window is changed from a normal to a minimized state
     *
     * @param e window event indicative of a change in status
     */
    @Override
    public void windowIconified(WindowEvent e) {

    }

    /**
     * Invoked when a window is made visible
     *
     * @param e window event indicative of a change in status
     */
    @Override
    public void windowOpened(WindowEvent e) {

    }

    /**
     * Invoked when the user attempts to close the window from the window's system menu
     *
     * @param e window event indicative of a change in status
     */
    @Override
    public void windowClosing(WindowEvent e) {

    }

    /**
     * Invoked when an action occurs
     *
     * @param e semantic event indicative that a component-defined action occurred
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        /* Remove the screen from display. */
        if (e.getActionCommand().equals("OK")) {
            displayScr.setVisible(false);
        }
    }
}
