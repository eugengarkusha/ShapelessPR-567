package pr587

import shapeless._, record._
object issue420 extends App {


 val r =  Record(
                  z0= 1,
                  y0= 1,
                  x0= 1,
                  w0= 1,
                  v0= 1,
                  u0= 1,
                  t0= 1,
                  s0= 1,
                  r0= 1,
                  q0= 1,
                  p0= 1,
                  o0= 1,
                  n0= 1,
                  m0= 1,
                  l0= 1,
                  k0= 1,
                  j0= 1,
                  i0= 1,
                  h0= 1,
                  g0= 1,
                  f0= 1,
                  e0= 1,
                  d0= 1,
                  c0= 1,
                  b0= 1,
                  a0= 1,
                  z= 1,
                  y= 1,
                  x= 1,
                  w= 1,
                  v= 1,
                  u= 1,
                  t= 1,
                  s= 1,
                  r= 1,
                  q= 1,
                  p= 1,
                  o= 1,
                  n= 1,
                  m= 1,
                  l= 1,
                  k= 1,
                  j= 1,
                  i= 1,
                  h= 1,
                  g= 1,
                  f= 1,
                  e= 1,
                  d= 1,
                  c= 1,
                  b= 1,
                  a= "1",
                  z01= 1,
                  y01= 1,
                  x01= 1,
                  w01= 1,
                  v01= 1,
                  u01= 1,
                  t01= 1,
                  s01= 1,
                  r01= 1,
                  q01= 1,
                  p01= 1,
                  o01= 1,
                  n01= 1,
                  m01= 1,
                  l01= 1,
                  k01= 1,
                  j01= 1,
                  i01= 1,
                  h01= 1,
                  g01= 1,
                  f01= 1,
                  e01= 1,
                  d01= 1,
                  c01= 1,
                  b01= 1,
                  a01= 1,
                  z1= 1,
                  y1= 1,
                  x1= 1,
                  w1= 1,
                  v1= 1,
                  u1= 1,
                  t1= 1,
                  s1= 1,
                  r1= 1,
                  q1= 1,
                  p1= 1,
                  o1= 1,
                  n1= 1,
                  m1= 1,
                  l1= 1,
                  k1= 1,
                  j1= 1,
                  i1= 1,
                  h1= 1,
                  g1= 1,
                  f1= 1,
                  e1= 1,
                  d1= 1,
                  c1= 1,
                  b1= 1,
                  a1 =  "1"
                )



    r('a)
    r.updated('a, 23)
    r.updateWith('a)(_ + "111")
    r.remove('a)
    r('b)
    r.updated('b, 23)
    r.updateWith('b)(_ + 1)
    r.remove('b)
    r('a)
    r.updated('a, 23)
    r.updateWith('a)(_ + "111")
    r.remove('a)
    r('b)
    r.updated('w, 23)
    r.updateWith('w)(_ + 1)
    r.remove('w)
    r('a)
    r.updated('a, 23)
    r.updateWith('a)(_ + "111")
    r.remove('a)
    r('e1)
    r.updated('e1, 23)
    r.updateWith('e1)(_ + 1)
    r.remove('e1)
    r('a)
    r.updated('a, "22")
    r.updateWith('a)(_ + "111")
    r.remove('a1)
    r('b)
    r.updated('b, 23)
    r.updateWith('b)(_ + 1)
    r.remove('b)
    r('a)
    r.updated('a, 23)
    r.updateWith('a)(_ + "111")
    r.remove('a)
    r('b)
    r.updated('b, 23)
    r.updateWith('b)(_ + 1)
    r.remove('b)


}
