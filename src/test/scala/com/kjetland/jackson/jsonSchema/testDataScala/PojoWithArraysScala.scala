package com.kjetland.jackson.jsonSchema.testDataScala

import com.kjetland.jackson.jsonSchema.testData.polymorphism1.Parent
import jakarta.validation.constraints.{NotNull, Size}
import com.kjetland.jackson.jsonSchema.testData.{ClassNotExtendingAnything, MyEnum}

case class PojoWithArraysScala
(
  @NotNull
  intArray1:Option[List[Integer]], // We never use array in scala - use list instead to make it compatible with PojoWithArrays (java)
  @NotNull
  stringArray:List[String], // We never use array in scala - use list instead to make it compatible with PojoWithArrays (java)
  @NotNull
  @Size(min = 1, max = 10)
  stringList:List[String],
  @NotNull
  polymorphismList:List[Parent],
  @NotNull
  polymorphismArray:List[Parent], // We never use array in scala - use list instead to make it compatible with PojoWithArrays (java)
  @NotNull
  regularObjectList:List[ClassNotExtendingAnything],
  @NotNull
  listOfListOfStrings:List[List[String]],
  @NotNull
  setOfUniqueValues:Set[MyEnum]
)
