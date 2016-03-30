package pr587

import shapeless._
import shapeless.record._
import shapeless.ops.record._
import shapeless.syntax._
import shapeless.syntax.singleton._
import shapeless.labelled._

object issue486 extends App {


  // construct a record with 15 elements
  def test[A](a:A) = {
    ('k1  ->> a) :: ('k2  ->> a) :: ('k3  ->> a) :: ('k4  ->> a) :: ('k5  ->> a) :: ('k6  ->> a) ::
      ('k7  ->> a) :: ('k8  ->> a) :: ('k9  ->> a) :: ('k10 ->> a) :: ('k11 ->> a) :: ('k12 ->> a) ::
      ('k13 ->> a) :: ('k14 ->> a) :: ('k15 ->> a) :: HNil
  }

  val r1 = test(42)
  val r2 = test(1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 :: 8 :: 9 :: 10 :: 11 :: 12 :: 13 :: 14 :: 15 :: HNil)
  val r3 = test(test(42))


  r1('k15)
  r2('k15)

  r3('k15)
  r3('k15)
  r3('k15)
  r3('k15)
  r3.remove('k15)
  r3.updated('k15,test(42))
  r3.updateWith('k15)(_ => 1)
  r3.remove('k15)
  r3.updated('k15,test(42))
  r3.updateWith('k15)(_ => 1)


}
