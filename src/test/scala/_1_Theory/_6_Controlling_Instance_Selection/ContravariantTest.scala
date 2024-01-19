package _1_Theory._6_Controlling_Instance_Selection

import org.scalatest.flatspec.AnyFlatSpec

class ContravariantTest extends AnyFlatSpec:

  "contravariant" should "work fine on both issues on scala3" in:
    import PrinterInstances._

    // issue1:
    PrinterUse.print(C)
    // a printer print C

    // issue2:
    PrinterUse.print(B)
    // b printer print B
