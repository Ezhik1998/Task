package ua.kpi.tef.controller.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


public interface Command {
    void execute(HttpServletRequest request) throws IOException, ServletException;
}