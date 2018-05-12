/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblacktreetest;

/**
 *
 * @author mounir
 */
 class RedBlackNode

 {    

     RedBlackNode left, right;

     int element;

     int color;

 

     /* Constructor */

     public RedBlackNode(int theElement)

     {

         this( theElement, null, null );

     } 

     /* Constructor */

     public RedBlackNode(int theElement, RedBlackNode lt, RedBlackNode rt)

     {

         left = lt;

         right = rt;

         element = theElement;

         color = 1;

     }    

 }