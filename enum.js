var Direction;
(function (Direction) {
    Direction[Direction["east"] = 0] = "east";
    Direction[Direction["west"] = 1] = "west";
    Direction[Direction["north"] = 2] = "north";
    Direction[Direction["south"] = 3] = "south";
})(Direction || (Direction = {}));
console.log(Direction[2]);
