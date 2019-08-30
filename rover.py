# -*- coding: utf-8 -*-
#!/usr/bin/env python3
import sys

class Rover:
    """
        Rover robot to move into mars 
    """

    def __init__(self, x=0, y=0, direction='N'):
        direction = direction.upper()
        self.x = x
        self.y = y
        if not direction in (map.possible_directions):
            sys.exit(1)
        self.direction = direction


    def move(movements):
        [i, n for i in movements movements.]

                

