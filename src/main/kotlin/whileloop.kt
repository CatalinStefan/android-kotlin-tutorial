fun main() {
    var puzzlePieces = 20
    var piecesPlaced = 0
//    while (piecesPlaced < puzzlePieces) {
//        println("Piece $piecesPlaced placed")
//        piecesPlaced++
//    }

    do {
        println("Piece $piecesPlaced placed")
        piecesPlaced++
    } while (piecesPlaced < puzzlePieces)

    println("Finished")
}