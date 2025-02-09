package scorex.testkit.properties.mempool

import org.ergoplatform.modifiers.mempool.ErgoTransaction
import org.ergoplatform.nodeView.mempool.ErgoMemPool
import org.scalacheck.Gen


trait MemoryPoolTest {
  val memPool: ErgoMemPool
  val memPoolGenerator: Gen[ErgoMemPool]
  val transactionGenerator: Gen[ErgoTransaction]
}
