/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.behaviouraldesignpatterns.visitor;

import java.util.List;

/**
 *
 * @author nobu
 */
public interface NumberVisitor
{
    public void visit(TwoElement twoElement);
    public void visit(ThreeElement threeElement);
    public void visit(List<NumberElement> elementList);
}
